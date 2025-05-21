package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazt;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WebSetupConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazt();
    final int a;
    public final AppDescription b;

    public WebSetupConfigRequest(int i, AppDescription appDescription) {
        this.a = i;
        arwm.s(appDescription);
        this.b = appDescription;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
