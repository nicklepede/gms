package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.binf;
import defpackage.bipw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ReadRawRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipw();
    public final List a;
    public final binf b;

    public ReadRawRequest(IBinder iBinder, List list) {
        binf binfVar;
        if (iBinder == null) {
            binfVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadRawCallback");
            binfVar = queryLocalInterface instanceof binf ? (binf) queryLocalInterface : new binf(iBinder);
        }
        this.b = binfVar;
        this.a = list;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("params", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        binf binfVar = this.b;
        atzr.D(parcel, 1, binfVar != null ? binfVar.a : null);
        atzr.y(parcel, 3, this.a, false);
        atzr.c(parcel, a);
    }
}
