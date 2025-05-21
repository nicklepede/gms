package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.bgip;
import defpackage.bglg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ReadRawRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglg();
    public final List a;
    public final bgip b;

    public ReadRawRequest(IBinder iBinder, List list) {
        bgip bgipVar;
        if (iBinder == null) {
            bgipVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadRawCallback");
            bgipVar = queryLocalInterface instanceof bgip ? (bgip) queryLocalInterface : new bgip(iBinder);
        }
        this.b = bgipVar;
        this.a = list;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("params", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        bgip bgipVar = this.b;
        arxc.D(parcel, 1, bgipVar != null ? bgipVar.a : null);
        arxc.y(parcel, 3, this.a, false);
        arxc.c(parcel, a);
    }
}
