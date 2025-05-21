package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cead;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpFlexTimeWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cead();
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public MdpFlexTimeWindow(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpFlexTimeWindow)) {
            return false;
        }
        MdpFlexTimeWindow mdpFlexTimeWindow = (MdpFlexTimeWindow) obj;
        return arwb.b(this.a, mdpFlexTimeWindow.a) && arwb.b(this.b, mdpFlexTimeWindow.b) && arwb.b(this.c, mdpFlexTimeWindow.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(mdpFlexTimeWindow.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("RecurrenceType", this.a, arrayList);
        arwa.b("StartTime", this.b, arrayList);
        arwa.b("EndTime", this.c, arrayList);
        arwa.b("DiscountPercentage", Integer.valueOf(this.d), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
