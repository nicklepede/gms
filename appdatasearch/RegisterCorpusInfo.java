package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C0197try;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.trz;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trz();
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
        C0197try c0197try = new C0197try(str2);
        c0197try.a = this.b;
        c0197try.b = build;
        Collections.addAll(c0197try.c, this.d);
        c0197try.d = this.e;
        c0197try.e = this.f;
        c0197try.f = account;
        c0197try.g = this.h;
        c0197try.h = this.i;
        c0197try.i = this.j;
        c0197try.j = this.k;
        return c0197try.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusInfo)) {
            return false;
        }
        RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
        return this.j == registerCorpusInfo.j && this.k == registerCorpusInfo.k && this.f == registerCorpusInfo.f && arwb.b(this.a, registerCorpusInfo.a) && arwb.b(this.b, registerCorpusInfo.b) && arwb.b(this.c, registerCorpusInfo.c) && arwb.b(this.e, registerCorpusInfo.e) && arwb.b(this.h, registerCorpusInfo.h) && arwb.b(this.g, registerCorpusInfo.g) && arwb.b(this.i, registerCorpusInfo.i) && Arrays.equals(this.d, registerCorpusInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Boolean.valueOf(this.f), this.g, this.h, this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.J(parcel, 4, this.d, i);
        arxc.t(parcel, 7, this.e, i, false);
        arxc.e(parcel, 8, this.f);
        arxc.t(parcel, 9, this.g, i, false);
        arxc.t(parcel, 10, this.h, i, false);
        arxc.v(parcel, 11, this.i, false);
        arxc.e(parcel, 12, this.j);
        arxc.o(parcel, 13, this.k);
        arxc.c(parcel, a);
    }
}
