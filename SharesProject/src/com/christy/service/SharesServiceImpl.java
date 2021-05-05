package com.christy.service;

import java.util.ArrayList;

import com.christy.bean.Shares;
import com.christy.persistance.SharesDao;
import com.christy.persistance.SharesDaoImpl;


public class SharesServiceImpl implements SharesService {
	
	private SharesDao sharesDao=new SharesDaoImpl();

	public ArrayList<Shares> getAllShares() {
		// TODO Auto-generated method stub
		return sharesDao.getShare();
	}

	@Override
	public boolean insertShares(Shares share) {
		// TODO Auto-generated method stub
		return sharesDao.insertRecord(share);
	}

	@Override
	public boolean deleteShares(String share_id) {
		// TODO Auto-generated method stub
		return sharesDao.deleteRecord(share_id);
	}

	@Override
	public boolean updateMarketValues(int market_values,String share_id) {
		// TODO Auto-generated method stub
		return sharesDao.updateMarketValues(market_values, share_id);
	}
	@Override
	public Shares searchSharesById(String share_id) {
		return sharesDao.searchById(share_id);
	}
}
