package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cwsb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ActiveUserData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwsb();
    public final ActiveUser a;
    public final String b;
    public final boolean c;
    public final int d;

    public ActiveUserData(ActiveUser activeUser, String str, boolean z, int i) {
        this.a = activeUser;
        this.b = str;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActiveUserData)) {
            return false;
        }
        ActiveUserData activeUserData = (ActiveUserData) obj;
        return arwb.b(this.a, activeUserData.a) && TextUtils.equals(this.b, activeUserData.b) && this.c == activeUserData.c && this.d == activeUserData.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActiveUser activeUser = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, activeUser, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
