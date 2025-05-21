package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgmi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class ListSubscriptionsResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bgmi();
    public final List a;
    public final Status b;

    public ListSubscriptionsResult(List list, Status status) {
        this.a = list;
        this.b = status;
    }

    @Override // defpackage.aqyf
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
        return this.b.equals(listSubscriptionsResult.b) && arwb.b(this.a, listSubscriptionsResult.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.b, arrayList);
        arwa.b("subscriptions", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
