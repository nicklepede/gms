package com.google.android.gms.fido.targetdevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bcow;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class TargetDirectTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcow();
    public final Status a;
    public final List b;

    public TargetDirectTransferResult(Status status, List list) {
        this.a = status;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
