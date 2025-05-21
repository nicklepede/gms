package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.util.ExceptionParcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i extends otm implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    public final void a(ExceptionParcel exceptionParcel) {
        Parcel fr = fr();
        oto.e(fr, exceptionParcel);
        ft(2, fr);
    }
}
