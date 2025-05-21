package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abar;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abar();
    final int a;
    public final String b;
    public final String c;

    public PACLConfig(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PACLConfig) {
            PACLConfig pACLConfig = (PACLConfig) obj;
            if (TextUtils.equals(this.b, pACLConfig.b) && TextUtils.equals(this.c, pACLConfig.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public PACLConfig(String str, String str2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
    }
}
