package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dexn;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class NotificationSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexn();
    final boolean a;
    final boolean b;
    final boolean c;
    final int d;

    public NotificationSettings(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NotificationSettings) {
            NotificationSettings notificationSettings = (NotificationSettings) obj;
            if (this.a == notificationSettings.a && this.b == notificationSettings.b && this.c == notificationSettings.c && this.d == notificationSettings.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("transactions", Boolean.valueOf(this.a), arrayList);
        arwa.b("plasticTransactions", Boolean.valueOf(this.b), arrayList);
        arwa.b("promotions", Boolean.valueOf(this.c), arrayList);
        arwa.b("bitMask", Integer.valueOf(this.d), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
