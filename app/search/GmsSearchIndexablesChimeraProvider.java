package com.google.android.gms.app.search;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;
import defpackage.vmd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GmsSearchIndexablesChimeraProvider extends ContentProvider {
    final vmd a = new vmd();

    @Override // com.google.android.chimera.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.a.attachInfo(context, providerInfo);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return this.a.delete(uri, str, strArr);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return this.a.getType(uri);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return this.a.insert(uri, contentValues);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        this.a.onCreate();
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.a.query(uri, strArr, str, strArr2, str2);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.a.update(uri, contentValues, str, strArr);
    }
}
