package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aczk;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ReauthSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aczk();
    final int a;

    @Deprecated
    public final String b;
    public final boolean c;
    public final Account d;
    public String e;

    public ReauthSettingsRequest(int i, String str, boolean z, Account account, String str2) {
        this.a = i;
        this.b = str;
        this.c = z;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public ReauthSettingsRequest(Account account, boolean z) {
        this(3, null, z, account, null);
    }
}
