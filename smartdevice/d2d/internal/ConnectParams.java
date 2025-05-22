package com.google.android.gms.smartdevice.d2d.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import defpackage.atzr;
import defpackage.dfrz;
import defpackage.dfsl;
import defpackage.dfso;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfrz();
    public dfso a;
    public ConnectionRequest b;
    public dfsl c;

    private ConnectParams() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        dfso dfsoVar = this.a;
        atzr.D(parcel, 1, dfsoVar == null ? null : dfsoVar.asBinder());
        atzr.t(parcel, 2, this.b, i, false);
        dfsl dfslVar = this.c;
        atzr.D(parcel, 3, dfslVar != null ? dfslVar.asBinder() : null);
        atzr.c(parcel, a);
    }

    public ConnectParams(dfso dfsoVar, ConnectionRequest connectionRequest, dfsl dfslVar) {
        this.a = dfsoVar;
        this.b = connectionRequest;
        this.c = dfslVar;
    }
}
