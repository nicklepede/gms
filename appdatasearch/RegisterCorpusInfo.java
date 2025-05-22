package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.vny;
import defpackage.vnz;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnz();
    public final String a;
    public final String b;
    public final Uri c;
    public final RegisterSectionInfo[] d;
    public final GlobalSearchCorpusConfig e;
    public final boolean f;
    public final Account g;
    public final RegisterCorpusIMEInfo h;
    public final String i;

    @Deprecated
    public final boolean j;
    public final int k;

    public RegisterCorpusInfo(String str, String str2, Uri uri, RegisterSectionInfo[] registerSectionInfoArr, GlobalSearchCorpusConfig globalSearchCorpusConfig, boolean z, Account account, RegisterCorpusIMEInfo registerCorpusIMEInfo, String str3, boolean z2, int i) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = registerSectionInfoArr;
        this.e = globalSearchCorpusConfig;
        this.f = z;
        this.g = account;
        this.h = registerCorpusIMEInfo;
        this.i = str3;
        this.j = z2;
        this.k = i;
    }

    public final RegisterCorpusInfo a(Account account) {
        String str = Uri.encode(account.type) + "/" + Uri.encode(account.name);
        String str2 = this.a + "/" + str;
        Uri build = this.c.buildUpon().appendEncodedPath(str).build();
        vny vnyVar = new vny(str2);
        vnyVar.a = this.b;
        vnyVar.b = build;
        Collections.addAll(vnyVar.c, this.d);
        vnyVar.d = this.e;
        vnyVar.e = this.f;
        vnyVar.f = account;
        vnyVar.g = this.h;
        vnyVar.h = this.i;
        vnyVar.i = this.j;
        vnyVar.j = this.k;
        return vnyVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusInfo)) {
            return false;
        }
        RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
        return this.j == registerCorpusInfo.j && this.k == registerCorpusInfo.k && this.f == registerCorpusInfo.f && atyq.b(this.a, registerCorpusInfo.a) && atyq.b(this.b, registerCorpusInfo.b) && atyq.b(this.c, registerCorpusInfo.c) && atyq.b(this.e, registerCorpusInfo.e) && atyq.b(this.h, registerCorpusInfo.h) && atyq.b(this.g, registerCorpusInfo.g) && atyq.b(this.i, registerCorpusInfo.i) && Arrays.equals(this.d, registerCorpusInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Boolean.valueOf(this.f), this.g, this.h, this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.J(parcel, 4, this.d, i);
        atzr.t(parcel, 7, this.e, i, false);
        atzr.e(parcel, 8, this.f);
        atzr.t(parcel, 9, this.g, i, false);
        atzr.t(parcel, 10, this.h, i, false);
        atzr.v(parcel, 11, this.i, false);
        atzr.e(parcel, 12, this.j);
        atzr.o(parcel, 13, this.k);
        atzr.c(parcel, a);
    }
}
