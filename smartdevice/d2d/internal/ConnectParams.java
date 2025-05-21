package com.google.android.gms.smartdevice.d2d.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import defpackage.arxc;
import defpackage.ddgu;
import defpackage.ddhg;
import defpackage.ddhj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddgu();
    public ddhj a;
    public ConnectionRequest b;
    public ddhg c;

    private ConnectParams() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        ddhj ddhjVar = this.a;
        arxc.D(parcel, 1, ddhjVar == null ? null : ddhjVar.asBinder());
        arxc.t(parcel, 2, this.b, i, false);
        ddhg ddhgVar = this.c;
        arxc.D(parcel, 3, ddhgVar != null ? ddhgVar.asBinder() : null);
        arxc.c(parcel, a);
    }

    public ConnectParams(ddhj ddhjVar, ConnectionRequest connectionRequest, ddhg ddhgVar) {
        this.a = ddhjVar;
        this.b = connectionRequest;
        this.c = ddhgVar;
    }
}
