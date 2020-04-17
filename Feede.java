package algorithmsandconstructs.s2019148;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

public class Feed implements FeedInterface{
	
	private List<FeedItem>itens = new ArrayList<FeedItem>();

	@Override
	public void addItem(FeedItem item) {
		itens.add(item);
	}

	@Override
	public Collection<String> listTitles() {
		
		return itens.stream().map(FeedItem::getTitle).collect(Collectors.toList());
	}

	@Override
	public FeedItem getItem(String title) {
		return itens.stream().filter(i-> title.equalsIgnoreCase(i.getTitle())).findAny().get();
	}
	//(eu mudei para esse método de baixo)
	public FeedItem getItem(String title) {

		FeedItem feedFound = null;
		int x = 0;
		for (x = 0; x < itens.size(); x++) {
			FeedItem fi = itens.get(x);
			if (title.equalsIgnoreCase(fi.getTitle())) {
				feedFound = fi;
			}
		}
		return feedFound;
	}
	@Override
	public int numItems() {
		// TODO Auto-generated method stub
		return itens.size();
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		return itens.stream()
				.filter(i->i.getTitle().contains(keyword)|| i.getContent().contains(keyword))
				.collect(Collectors.toList());
	}
	
	//Mudei para esse método de baixo 
	public Collection<FeedItem> findItems(String keyword) {
		Collection<FeedItem>listFound = new ArrayList<FeedItem>();
		int x = 0;
		for (x = 0; x < itens.size(); x++) {
			FeedItem i = itens.get(x);
			if(i.getTitle().contains(keyword)|| i.getContent().contains(keyword)) {
				listFound.add(i);
			}
		}
		return listFound;

	}
	
}
