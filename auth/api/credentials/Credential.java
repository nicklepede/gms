package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.ekvk;
import defpackage.xmk;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new xmk();
    public final String a;
    public final String b;
    public final Uri c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        Boolean bool;
        atzb.t(str, "credential identifier cannot be null");
        String trim = str.trim();
        atzb.r(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                bool = false;
            } else {
                Uri parse = Uri.parse(str4);
                if (!parse.isAbsolute() || !parse.isHierarchical() || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority())) {
                    bool = false;
                } else {
                    bool = Boolean.valueOf("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()));
                }
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.b = str2;
        this.c = uri;
        this.d = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.a = trim;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final int a() {
        int i = true != ekvk.c(this.b) ? 2 : 1;
        if (this.c != null) {
            i++;
        }
        if (!ekvk.c(this.g)) {
            i++;
        }
        return !ekvk.c(this.h) ? i + 1 : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.b, credential.b) && atyq.b(this.c, credential.c) && TextUtils.equals(this.e, credential.e) && TextUtils.equals(this.f, credential.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 9, this.g, false);
        atzr.v(parcel, 10, this.h, false);
        atzr.c(parcel, a);
    }
}
