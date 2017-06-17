package com.gaoming.example.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by gaoming on 2017/5/17.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    public List<Crime> getmCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID uuid){
        for (Crime crime : mCrimes){
            if (crime.getId().equals(uuid)){
                android.util.Log.d("gaoming", String.valueOf(crime.getId()));
                return crime;
            }
        }
        return null;
    }
}
