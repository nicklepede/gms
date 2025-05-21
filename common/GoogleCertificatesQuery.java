package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.aqtx;
import defpackage.aqug;
import defpackage.arvd;
import defpackage.arve;
import defpackage.arvf;
import defpackage.arxc;
import defpackage.azht;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqug();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final arve d;

    public GoogleCertificatesQuery(String str, arve arveVar, boolean z, boolean z2) {
        this.a = str;
        this.d = arveVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arve arveVar = this.d;
        if (arveVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            arveVar = null;
        }
        arxc.D(parcel, 2, arveVar);
        arxc.e(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        aqtx aqtxVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                azht b = (queryLocalInterface instanceof arvf ? (arvf) queryLocalInterface : new arvd(iBinder)).b();
                byte[] bArr = b == null ? null : (byte[]) ObjectWrapper.a(b);
                if (bArr != null) {
                    aqtxVar = new aqtx(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = aqtxVar;
        this.b = z;
        this.c = z2;
    }
}
