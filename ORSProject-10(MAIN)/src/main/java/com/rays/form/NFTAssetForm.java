package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;

public class NFTAssetForm extends BaseForm {

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
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		return super.getDto();
	}

}
