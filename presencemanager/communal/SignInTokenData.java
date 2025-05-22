package com.google.android.gms.presencemanager.communal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.czci;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignInTokenData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czci();
    public final String a;

    public SignInTokenData(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInTokenData) {
            return TextUtils.equals(this.a, ((SignInTokenData) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a);
    }
}
