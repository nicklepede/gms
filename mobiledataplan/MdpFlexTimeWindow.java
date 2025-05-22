package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgjk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpFlexTimeWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjk();
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
        return atyq.b(this.a, mdpFlexTimeWindow.a) && atyq.b(this.b, mdpFlexTimeWindow.b) && atyq.b(this.c, mdpFlexTimeWindow.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(mdpFlexTimeWindow.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("RecurrenceType", this.a, arrayList);
        atyp.b("StartTime", this.b, arrayList);
        atyp.b("EndTime", this.c, arrayList);
        atyp.b("DiscountPercentage", Integer.valueOf(this.d), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
