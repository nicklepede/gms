package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czby;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ActiveUserData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czby();
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
        return atyq.b(this.a, activeUserData.a) && TextUtils.equals(this.b, activeUserData.b) && this.c == activeUserData.c && this.d == activeUserData.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActiveUser activeUser = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, activeUser, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
