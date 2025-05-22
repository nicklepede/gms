package com.google.android.gms.appdatasearch;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GlobalSearchConstants {
    public static GlobalSearchApplication getGlobalSearchApplicationFromIntent(Intent intent) {
        if (!"com.google.android.gms.icing.GlobalSearchAppRegistered3".equals(intent.getAction()) && !"com.google.android.gms.icing.GlobalSearchAppRegistered2".equals(intent.getAction())) {
            throw new IllegalArgumentException("Not a GLOBAL_SEARCH_APP_REGISTERED_N_INTENT_ACTION intent");
        }
        Bundle extras = intent.getExtras();
        byte[] byteArray = extras != null ? extras.getByteArray("App") : null;
        if (byteArray == null) {
            throw new IllegalArgumentException("Invalid intent");
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            return (GlobalSearchApplication) GlobalSearchApplication.CREATOR.createFromParcel(obtain);
        } finally {
            obtain.recycle();
        }
    }
}
