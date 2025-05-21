package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.atpm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes3.dex */
public class FenceTriggerInfoImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atpm();
    public final boolean a;
    public final String b;

    public FenceTriggerInfoImpl(boolean z, String str) {
        this.a = z;
        arwm.q(str);
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, this.a);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
