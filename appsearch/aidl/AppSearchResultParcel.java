package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.GetSchemaResponse;
import com.google.android.gms.appsearch.InternalSetSchemaResponse;
import com.google.android.gms.appsearch.SearchResultPage;
import com.google.android.gms.appsearch.StorageInfo;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.vys;
import defpackage.vzx;
import defpackage.waz;
import defpackage.wba;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AppSearchResultParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new waz();
    public static final Parcelable.Creator a = new wba();
    public final int b;
    public final String c;
    public InternalSetSchemaResponse d;
    public GetSchemaResponse e;
    public List f;
    public GenericDocumentParcel g;
    public SearchResultPage h;
    public List i;
    public List j;
    public StorageInfo k;
    public final vys l;

    public AppSearchResultParcel(int i, String str, InternalSetSchemaResponse internalSetSchemaResponse, GetSchemaResponse getSchemaResponse, List list, GenericDocumentParcel genericDocumentParcel, SearchResultPage searchResultPage, List list2, List list3, StorageInfo storageInfo) {
        this.b = i;
        this.c = str;
        if (i != 0) {
            this.l = new vys(i, null, str);
            return;
        }
        this.d = internalSetSchemaResponse;
        this.e = getSchemaResponse;
        this.f = list;
        this.g = genericDocumentParcel;
        this.h = searchResultPage;
        this.i = list2;
        this.j = list3;
        this.k = storageInfo;
        if (internalSetSchemaResponse != null) {
            this.l = new vys(0, internalSetSchemaResponse, null);
            return;
        }
        if (getSchemaResponse != null) {
            this.l = new vys(0, getSchemaResponse, null);
            return;
        }
        if (list != null) {
            this.l = new vys(0, list, null);
            return;
        }
        if (genericDocumentParcel != null) {
            this.l = new vys(0, genericDocumentParcel, null);
            return;
        }
        if (searchResultPage != null) {
            this.l = new vys(0, searchResultPage, null);
            return;
        }
        if (list2 != null) {
            this.l = new vys(0, list2, null);
            return;
        }
        if (list3 != null) {
            this.l = new vys(0, list3, null);
        } else if (storageInfo != null) {
            this.l = new vys(0, storageInfo, null);
        } else {
            this.l = new vys(0, null, null);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            wba.b(this, obtain, i);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            vzx.a(parcel, marshall);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
