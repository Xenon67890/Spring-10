package com.rays.dto;

import com.rays.common.BaseDTO;

public class NFTAssetDTO extends BaseDTO{
	
	private String tokenName;
	
	private String blockChain;
	
	private String OwnerWallet;
	
	private String mintDate;

	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public String getBlockChain() {
		return blockChain;
	}

	public void setBlockChain(String blockChain) {
		this.blockChain = blockChain;
	}

	public String getOwnerWallet() {
		return OwnerWallet;
	}

	public void setOwnerWallet(String ownerWallet) {
		OwnerWallet = ownerWallet;
	}

	public String getMintDate() {
		return mintDate;
	}

	public void setMintDate(String mintDate) {
		this.mintDate = mintDate;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "blockChain";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return blockChain;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "blockChain";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "NFTAsset";
	}
	
	@Override
	public String getValue() {
		return blockChain;
	}

}
