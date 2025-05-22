package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.aswm;
import defpackage.aswv;
import defpackage.atxs;
import defpackage.atxt;
import defpackage.atxu;
import defpackage.atzr;
import defpackage.bblp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aswv();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final atxt d;

    public GoogleCertificatesQuery(String str, atxt atxtVar, boolean z, boolean z2) {
        this.a = str;
        this.d = atxtVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atxt atxtVar = this.d;
        if (atxtVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            atxtVar = null;
        }
        atzr.D(parcel, 2, atxtVar);
        atzr.e(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        aswm aswmVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                bblp b = (queryLocalInterface instanceof atxu ? (atxu) queryLocalInterface : new atxs(iBinder)).b();
                byte[] bArr = b == null ? null : (byte[]) ObjectWrapper.a(b);
                if (bArr != null) {
                    aswmVar = new aswm(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = aswmVar;
        this.b = z;
        this.c = z2;
    }
}
