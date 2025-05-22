package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.avtp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes3.dex */
public class FenceTriggerInfoImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avtp();
    public final boolean a;
    public final String b;

    public FenceTriggerInfoImpl(boolean z, String str) {
        this.a = z;
        atzb.q(str);
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, this.a);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
