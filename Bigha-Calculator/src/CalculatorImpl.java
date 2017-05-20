

public class CalculatorImpl implements Calculator
{

	@Override
	public String addition(int[] firstUnits,int[] secondUnits) 
	{
		int dKattha=0,dDhur=0,dDhurki=0,dFurki=0,dLurki=0,dSurki=0;
		int mBigha=0,mKattha=0,mDhur=0,mDhurki=0,mFurki=0,mLurki=0,mSurki=0;
		
		if(firstUnits[6] !=0 || secondUnits[6] !=0)
		{
			int iSurki=firstUnits[6]+secondUnits[6];
			if(iSurki>20)
			{
				dSurki=iSurki/20;
				mSurki=iSurki%20;
			}
			if(dSurki !=0)
				mLurki=dSurki;
			else
				mSurki +=iSurki;
			if(dSurki>20)
			{
				mFurki=dSurki/20;
				mLurki=dSurki%20;
			}
		}
		if(firstUnits[5] !=0 || secondUnits[5]!=0)
		{
			int iLurki=firstUnits[5]+secondUnits[5];
			if(iLurki>20)
			{
				dLurki=iLurki/20;
				mLurki +=iLurki%20;
			}
			if(dLurki !=0)
				mFurki=dLurki;
			else
				mLurki +=iLurki;
			if(dLurki>20)
			{
				mDhurki=dLurki/20;
				mFurki=dLurki%20;
			}
		}
		if(firstUnits[4] !=0 || secondUnits[4]!=0)
		{
			int iFurki=firstUnits[4]+secondUnits[4];
			if(iFurki>20)
			{
				dFurki=iFurki/20;
				mFurki +=iFurki%20;
			}
			if(dFurki !=0)
				mDhurki=dFurki;
			else
				mFurki +=iFurki;
			if(dFurki>20)
			{
				mDhur=dFurki/20;
				mDhurki=dFurki%20;
			}
		}
		if(firstUnits[3] !=0 || secondUnits[3] !=0)
		{
			int iDhurki=firstUnits[3]+secondUnits[3];
			if(iDhurki>20)
			{
				dDhurki=iDhurki/20;
				mDhurki +=iDhurki%20;
			}
			if(dDhurki !=0)
				mDhur=dDhurki;
			else
				mDhurki +=iDhurki;
			if(dDhurki>20)
			{
				mKattha=dDhurki/20;
				mDhur=dDhurki%20;
			}
		}
		if(firstUnits[2] !=0 || secondUnits[2]!=0)
		{
			int iDhur=firstUnits[2]+secondUnits[2];
			if(iDhur>20)
			{
				dDhur=iDhur/20;
				mDhur +=iDhur%20;
			}
			if(dDhur !=0)
				mKattha=dDhur;
			else
				mDhur +=iDhur;
			if(dDhur>20)
			{
				mBigha=dDhur/20;
				mKattha=dDhur%20;
			}
		}
		if(firstUnits[1] !=0 || secondUnits[1] !=0)
		{
			int iKattha=firstUnits[1]+secondUnits[1];
			if(iKattha>20)
			{
				dKattha=iKattha/20;
				mKattha +=iKattha%20;
			}
			if(dKattha !=0)
				mBigha=dKattha;
			else
				mKattha +=iKattha;
		}
		if(firstUnits[0] !=0 || secondUnits[0]!=0)
		{
			int iBigha=firstUnits[0]+secondUnits[0];
			mBigha +=iBigha;
		}
		
		StringBuilder result=new StringBuilder();
		if(mBigha>0)
			result.append(mBigha+" Bigha,");
		if(mKattha>0)
			result.append(mKattha+" Kattha,");
		if(mDhur>0)
			result.append(mDhur+" Dhur,");
		if(mDhurki>0)
			result.append(mDhurki+" Dhurki,");
		if(mFurki>0)
			result.append(mFurki+" Furki,");
		if(mLurki>0)
			result.append(mLurki+" Lurki,");
		if(mSurki>0)
			result.append(mSurki+" Surki");
		
		return result.toString();
	}

	@Override
	public String substraction(int[] firstUnits,int[] secondUnits) 
	{
		int dKattha=0,dDhur=0,dDhurki=0,dFurki=0,dLurki=0,dSurki=0;
		int mBigha=0,mKattha=0,mDhur=0,mDhurki=0,mFurki=0,mLurki=0,mSurki=0;
		
		if(firstUnits[6] !=0 || secondUnits[6] !=0)
		{
			int iSurki=firstUnits[6]-secondUnits[6];
			if(iSurki>20)
			{
				dSurki=iSurki/20;
				mSurki=iSurki%20;
			}
			if(dSurki !=0)
				mLurki=dSurki;
			else
				mSurki +=iSurki;
			if(dSurki>20)
			{
				mFurki=dSurki/20;
				mLurki=dSurki%20;
			}
		}
		if(firstUnits[5] !=0 || secondUnits[5]!=0)
		{
			int iLurki=firstUnits[5]-secondUnits[5];
			if(iLurki>20)
			{
				dLurki=iLurki/20;
				mLurki +=iLurki%20;
			}
			if(dLurki !=0)
				mFurki=dLurki;
			else
				mLurki +=iLurki;
			if(dLurki>20)
			{
				mDhurki=dLurki/20;
				mFurki=dLurki%20;
			}
		}
		if(firstUnits[4] !=0 || secondUnits[4]!=0)
		{
			int iFurki=firstUnits[4]-secondUnits[4];
			if(iFurki>20)
			{
				dFurki=iFurki/20;
				mFurki +=iFurki%20;
			}
			if(dFurki !=0)
				mDhurki=dFurki;
			else
				mFurki +=iFurki;
			if(dFurki>20)
			{
				mDhur=dFurki/20;
				mDhurki=dFurki%20;
			}
		}
		if(firstUnits[3] !=0 || secondUnits[3] !=0)
		{
			int iDhurki=firstUnits[3]-secondUnits[3];
			if(iDhurki>20)
			{
				dDhurki=iDhurki/20;
				mDhurki +=iDhurki%20;
			}
			if(dDhurki !=0)
				mDhur=dDhurki;
			else
				mDhurki +=iDhurki;
			if(dDhurki>20)
			{
				mKattha=dDhurki/20;
				mDhur=dDhurki%20;
			}
		}
		if(firstUnits[2] !=0 || secondUnits[2]!=0)
		{
			int iDhur=firstUnits[2]-secondUnits[2];
			if(iDhur>20)
			{
				dDhur=iDhur/20;
				mDhur +=iDhur%20;
			}
			if(dDhur !=0)
				mKattha=dDhur;
			else
				mDhur +=iDhur;
			if(dDhur>20)
			{
				mBigha=dDhur/20;
				mKattha=dDhur%20;
			}
		}
		if(firstUnits[1] !=0 || secondUnits[1] !=0)
		{
			int iKattha=firstUnits[1]-secondUnits[1];
			if(iKattha>20)
			{
				dKattha=iKattha/20;
				mKattha +=iKattha%20;
			}
			if(dKattha !=0)
				mBigha=dKattha;
			else
				mKattha +=iKattha;
		}
		if(firstUnits[0] !=0 || secondUnits[0]!=0)
		{
			int iBigha=firstUnits[0]-secondUnits[0];
			mBigha +=iBigha;
		}
		
		StringBuilder result=new StringBuilder();
		if(mBigha!=0)
			result.append(mBigha+" Bigha,");
		if(mKattha!=0)
			result.append(mKattha+" Kattha,");
		if(mDhur!=0)
			result.append(mDhur+" Dhur,");
		if(mDhurki!=0)
			result.append(mDhurki+" Dhurki,");
		if(mFurki!=0)
			result.append(mFurki+" Furki,");
		if(mLurki!=0)
			result.append(mLurki+" Lurki,");
		if(mSurki!=0)
			result.append(mSurki+" Surki");
		
		return result.toString();
	}

	@Override
	public String multiplication(int[] firstUnits,int unitFactor) 
	{
		int dKattha=0,dDhur=0,dDhurki=0,dFurki=0,dLurki=0,dSurki=0;
		int mBigha=0,mKattha=0,mDhur=0,mDhurki=0,mFurki=0,mLurki=0,mSurki=0;
		
		if(firstUnits[6] !=0)
		{
			int iSurki=firstUnits[6]*unitFactor;
			if(iSurki>20)
			{
				dSurki=iSurki/20;
				mSurki=iSurki%20;
			}
			if(dSurki !=0)
				mLurki=dSurki;
			else
				mSurki=iSurki;
			if(dSurki>20)
			{
				mFurki=dSurki/20;
				mLurki=dSurki%20;
			}
		}
		if(firstUnits[5] !=0)
		{
			int iLurki=firstUnits[5]*unitFactor;
			if(iLurki>20)
			{
				dLurki=iLurki/20;
				mLurki +=iLurki%20;
			}
			if(dLurki !=0)
				mFurki=dLurki;
			else
				mLurki=iLurki;
			if(dLurki>20)
			{
				mDhurki=dLurki/20;
				mFurki=dLurki%20;
			}
		}
		if(firstUnits[4] !=0)
		{
			int iFurki=firstUnits[4]*unitFactor;
			if(iFurki>20)
			{
				dFurki=iFurki/20;
				mFurki +=iFurki%20;
			}
			if(dFurki !=0)
				mDhurki=dFurki;
			else
				mFurki=iFurki;
			if(dFurki>20)
			{
				mDhur=dFurki/20;
				mDhurki=dFurki%20;
			}
		}
		if(firstUnits[3] !=0)
		{
			int iDhurki=firstUnits[3]*unitFactor;
			if(iDhurki>20)
			{
				dDhurki=iDhurki/20;
				mDhurki +=iDhurki%20;
			}
			if(dDhurki !=0)
				mDhur=dDhurki;
			else
				mDhurki=iDhurki;
			if(dDhurki>20)
			{
				mKattha=dDhurki/20;
				mDhur=dDhurki%20;
			}
		}
		if(firstUnits[2] !=0)
		{
			int iDhur=firstUnits[2]*unitFactor;
			if(iDhur>20)
			{
				dDhur=iDhur/20;
				mDhur +=iDhur%20;
			}
			if(dDhur !=0)
				mKattha=dDhur;
			else
				mDhur=iDhur;
			if(dDhur>20)
			{
				mBigha=dDhur/20;
				mKattha=dDhur%20;
			}
		}
		if(firstUnits[1] !=0)
		{
			int iKattha=firstUnits[1]*unitFactor;
			if(iKattha>20)
			{
				dKattha=iKattha/20;
				mKattha +=iKattha%20;
			}
			if(dKattha !=0)
				mBigha=dKattha;
			else
				mKattha +=iKattha;
			
		}
		if(firstUnits[0] !=0)
		{
			int iBigha=firstUnits[0]*unitFactor;
			mBigha +=iBigha;
		}
		
		StringBuilder result=new StringBuilder();
		if(mBigha!=0)
			result.append(mBigha+" Bigha,");
		if(mKattha!=0)
			result.append(mKattha+" Kattha,");
		if(mDhur!=0)
			result.append(mDhur+" Dhur,");
		if(mDhurki!=0)
			result.append(mDhurki+" Dhurki,");
		if(mFurki!=0)
			result.append(mFurki+" Furki,");
		if(mLurki!=0)
			result.append(mLurki+" Lurki,");
		if(mSurki!=0)
			result.append(mSurki+" Surki");
		
		return result.toString();
	}

	@Override
	public String division(int[] firstUnits,int unitFactor) 
	{
		int dBigha=0,dKattha=0,dDhur=0,dDhurki=0,dFurki=0,dLurki=0,dSurki=0;
		int mBigha=0,mKattha=0,mDhur=0,mDhurki=0,mFurki=0,mLurki=0,mSurki=0;
		
		if(firstUnits[0] !=0)
		{
			dBigha=firstUnits[0]/unitFactor;
			mBigha=firstUnits[0]%unitFactor;
			
			if(mBigha !=0)
				dKattha=mBigha*20;
		}
		if(firstUnits[1] !=0)
		{
			int iKattha=dKattha+firstUnits[1];
			if(dKattha !=0)
			{
				dKattha=iKattha/unitFactor;
				mKattha=iKattha%unitFactor;
			}
			else
			{
				dKattha=firstUnits[1]/unitFactor;
				mKattha=firstUnits[1]%unitFactor;
			}
			if(dKattha>20)
			{
				dBigha +=dKattha/20;
				int kattha=dKattha%20;
				dKattha =kattha;
			}
			if(mKattha !=0)
				dDhur=mKattha*20;
		}
		else
		{
			if(dKattha !=0)
			{
				int Kattha=dKattha/unitFactor;
				mKattha=dKattha%unitFactor;
				dKattha=Kattha;
			}
			if(mKattha !=0)
				dDhur=mKattha*20;
		}
		
		if(firstUnits[2] !=0)
		{
			int iDhur=dDhur+firstUnits[2];
			if(dDhur !=0)
			{
				dDhur=iDhur/unitFactor;
				mDhur=iDhur%unitFactor;
			}
			else
			{
				dDhur=firstUnits[2]/unitFactor;
				mDhur=firstUnits[2]%unitFactor;
			}
			if(dDhur>20)
			{
				dKattha +=dDhur/20;
				int Dhur=dDhur%20;
				dDhur=Dhur;
			}
			if(mDhur !=0)
				dDhurki=mDhur*20;
		}
		else
		{
			if(dDhur !=0)
			{
				int Dhur=dDhur/unitFactor;
				mDhur=dDhur%unitFactor;
				dDhur=Dhur;
			}
			if(mDhur !=0)
				dDhurki=mDhur*20;
		}
		
		if(firstUnits[3] !=0)
		{
			int iDhurki=dDhurki+firstUnits[3];
			if(dDhurki !=0)
			{
				dDhurki=iDhurki/unitFactor;
				mDhurki=iDhurki%unitFactor;
			}
			else
			{
				dDhurki=firstUnits[3]/unitFactor;
				mDhurki=firstUnits[3]%unitFactor;
			}
			if(dDhurki>20)
			{
				mDhur +=dDhurki/20;
				int Dhurki=dDhurki%20;
				dDhurki=Dhurki;
			}
			if(mDhurki !=0)
				dFurki=mDhurki*20;
		}
		else
		{
			if(dDhurki !=0)
			{
				int Dhurki=dDhurki/unitFactor;
				mDhurki=dDhurki%unitFactor;
				dDhurki=Dhurki;
			}
			if(mDhurki !=0)
				dFurki=mDhurki*20;
		}
		
		if(firstUnits[4] !=0)
		{
			int iFurki=dFurki+firstUnits[4];
			if(dFurki !=0)
			{
				dFurki=iFurki/unitFactor;
				mFurki=iFurki%unitFactor;
			}
			else
			{
				dFurki=firstUnits[4]/unitFactor;
				mFurki=firstUnits[4]%unitFactor;
			}
			if(dFurki>20)
			{
				dDhurki +=dFurki/20;
				int Furki=dFurki%20;
				dFurki=Furki;
			}
			if(mFurki !=0)
				dLurki=mFurki*20;
		}
		else
		{
			if(dFurki !=0)
			{
				int Furki=dFurki/unitFactor;
				mFurki=dFurki%unitFactor;
				dFurki=Furki;
			}
			if(mFurki !=0)
				dLurki=mFurki*20;
		}
		
		if(firstUnits[5] !=0)
		{
			int iLurki=dLurki+firstUnits[5];
			if(dLurki !=0)
			{
				dLurki=iLurki/unitFactor;
				mLurki=iLurki%unitFactor;
			}
			else
			{
				dLurki=firstUnits[5]/unitFactor;
				mLurki=firstUnits[5]%unitFactor;
			}
			if(dLurki>20)
			{
				dFurki +=dLurki/20;
				int Lurki=dLurki%20;
				dLurki=Lurki;
			}
			if(mLurki !=0)
				dSurki=mLurki*20;
		}
		else
		{
			if(dLurki !=0)
			{
				int Lurki=dLurki/unitFactor;
				mLurki=dLurki%unitFactor;
				dLurki=Lurki;
			}
			if(mLurki !=0)
				dSurki=mLurki*20;
		}
		
		if(firstUnits[6] !=0)
		{
			int iSurki=dSurki+firstUnits[6];
			if(dSurki !=0)
			{
				dSurki =iSurki/unitFactor;
			}
			else
			{
				dSurki =firstUnits[6]/unitFactor;
			}
			if(dSurki>20)
			{
				dLurki +=dSurki/20;
				int Surki=dSurki%20;
				dSurki =Surki;
			}
		}
		else
		{
			if(dSurki !=0)
			{
				dSurki =dSurki/unitFactor;
			}
		}
		
		StringBuilder result=new StringBuilder();

		if(dBigha>0)
			result.append(dBigha+" Bigha,");
		if(dKattha>0)
			result.append(dKattha+" Kattha,");
		if(dDhur>0)
			result.append(dDhur+" Dhur,");
		if(dDhurki>0)
			result.append(dDhurki+" Dhurki,");
		if(dFurki>0)
			result.append(dFurki+" Furki,");
		if(dLurki>0)
			result.append(dLurki+" Lurki,");
		if(dSurki>0)
			result.append(dSurki+" Surki");
		
		return result.toString();
	}

}
