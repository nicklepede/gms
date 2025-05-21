package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class k extends otm implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void a(String str, DecagonRequestParcel decagonRequestParcel) {
        Parcel fr = fr();
        fr.writeString(str);
        oto.e(fr, decagonRequestParcel);
        ft(1, fr);
    }
}
