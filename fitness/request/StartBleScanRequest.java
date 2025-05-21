package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bglc;
import defpackage.bglr;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class StartBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglr();
    public final List a;
    public final int b;
    public final bgiw c;
    public final bglc d;

    public StartBleScanRequest(StartBleScanRequest startBleScanRequest, bgiw bgiwVar) {
        List list = startBleScanRequest.a;
        bglc bglcVar = startBleScanRequest.d;
        int i = startBleScanRequest.b;
        this.a = list;
        this.d = bglcVar;
        this.b = i;
        this.c = bgiwVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("dataTypes", this.a, arrayList);
        arwa.b("timeoutSecs", Integer.valueOf(this.b), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, DesugarCollections.unmodifiableList(this.a), false);
        bglc bglcVar = this.d;
        arxc.D(parcel, 2, bglcVar == null ? null : bglcVar.a);
        arxc.o(parcel, 3, this.b);
        bgiw bgiwVar = this.c;
        arxc.D(parcel, 4, bgiwVar != null ? bgiwVar.asBinder() : null);
        arxc.c(parcel, a);
    }

    public StartBleScanRequest(List list, IBinder iBinder, int i, IBinder iBinder2) {
        bglc bglcVar;
        this.a = list;
        bgiw bgiwVar = null;
        if (iBinder == null) {
            bglcVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            bglcVar = queryLocalInterface instanceof bglc ? (bglc) queryLocalInterface : new bglc(iBinder);
        }
        this.d = bglcVar;
        this.b = i;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiwVar = queryLocalInterface2 instanceof bgiw ? (bgiw) queryLocalInterface2 : new bgiu(iBinder2);
        }
        this.c = bgiwVar;
    }
}
