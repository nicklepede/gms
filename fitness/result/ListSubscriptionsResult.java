package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biqy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class ListSubscriptionsResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new biqy();
    public final List a;
    public final Status b;

    public ListSubscriptionsResult(List list, Status status) {
        this.a = list;
        this.b = status;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListSubscriptionsResult)) {
            return false;
        }
        ListSubscriptionsResult listSubscriptionsResult = (ListSubscriptionsResult) obj;
        return this.b.equals(listSubscriptionsResult.b) && atyq.b(this.a, listSubscriptionsResult.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.b, arrayList);
        atyp.b("subscriptions", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
