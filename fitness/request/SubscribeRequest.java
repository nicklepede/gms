package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.biqj;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqj();
    public Subscription a;
    public final boolean b;
    public final binm c;

    public SubscribeRequest(Subscription subscription, boolean z, binm binmVar) {
        this.a = subscription;
        this.b = z;
        this.c = binmVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("subscription", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.e(parcel, 2, this.b);
        binm binmVar = this.c;
        atzr.D(parcel, 3, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }

    public SubscribeRequest(Subscription subscription, boolean z, IBinder iBinder) {
        binm binkVar;
        this.a = subscription;
        this.b = z;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.c = binkVar;
    }
}
