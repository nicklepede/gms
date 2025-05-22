package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.bips;
import defpackage.biqh;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class StartBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqh();
    public final List a;
    public final int b;
    public final binm c;
    public final bips d;

    public StartBleScanRequest(StartBleScanRequest startBleScanRequest, binm binmVar) {
        List list = startBleScanRequest.a;
        bips bipsVar = startBleScanRequest.d;
        int i = startBleScanRequest.b;
        this.a = list;
        this.d = bipsVar;
        this.b = i;
        this.c = binmVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataTypes", this.a, arrayList);
        atyp.b("timeoutSecs", Integer.valueOf(this.b), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, DesugarCollections.unmodifiableList(this.a), false);
        bips bipsVar = this.d;
        atzr.D(parcel, 2, bipsVar == null ? null : bipsVar.a);
        atzr.o(parcel, 3, this.b);
        binm binmVar = this.c;
        atzr.D(parcel, 4, binmVar != null ? binmVar.asBinder() : null);
        atzr.c(parcel, a);
    }

    public StartBleScanRequest(List list, IBinder iBinder, int i, IBinder iBinder2) {
        bips bipsVar;
        this.a = list;
        binm binmVar = null;
        if (iBinder == null) {
            bipsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            bipsVar = queryLocalInterface instanceof bips ? (bips) queryLocalInterface : new bips(iBinder);
        }
        this.d = bipsVar;
        this.b = i;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binmVar = queryLocalInterface2 instanceof binm ? (binm) queryLocalInterface2 : new bink(iBinder2);
        }
        this.c = binmVar;
    }
}
