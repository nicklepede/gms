package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adav;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.atzs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SupervisedAccountOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adav();
    public final String a;
    public final String b;
    public final int c;

    public SupervisedAccountOptions(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public static SupervisedAccountOptions a(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? new SupervisedAccountOptions("", "") : (SupervisedAccountOptions) atzs.a(bArr, CREATOR);
    }

    public static SupervisedAccountOptions b(Bundle bundle) {
        return a(bundle.getByteArray("supervised_account_options"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SupervisedAccountOptions) {
            SupervisedAccountOptions supervisedAccountOptions = (SupervisedAccountOptions) obj;
            if (atyq.b(this.a, supervisedAccountOptions.a) && atyq.b(this.b, supervisedAccountOptions.b) && this.c == supervisedAccountOptions.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public SupervisedAccountOptions() {
        this("", "");
    }

    public SupervisedAccountOptions(String str, String str2) {
        this(str, str2, 0);
    }
}
