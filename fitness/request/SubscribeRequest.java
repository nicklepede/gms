package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bglt;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglt();
    public Subscription a;
    public final boolean b;
    public final bgiw c;

    public SubscribeRequest(Subscription subscription, boolean z, bgiw bgiwVar) {
        this.a = subscription;
        this.b = z;
        this.c = bgiwVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("subscription", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.e(parcel, 2, this.b);
        bgiw bgiwVar = this.c;
        arxc.D(parcel, 3, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }

    public SubscribeRequest(Subscription subscription, boolean z, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = subscription;
        this.b = z;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.c = bgiuVar;
    }
}
