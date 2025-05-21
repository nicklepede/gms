package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.eiif;
import defpackage.vqj;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vqj();
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
        arwm.t(str, "credential identifier cannot be null");
        String trim = str.trim();
        arwm.r(trim, "credential identifier cannot be empty");
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
        int i = true != eiif.c(this.b) ? 2 : 1;
        if (this.c != null) {
            i++;
        }
        if (!eiif.c(this.g)) {
            i++;
        }
        return !eiif.c(this.h) ? i + 1 : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.b, credential.b) && arwb.b(this.c, credential.c) && TextUtils.equals(this.e, credential.e) && TextUtils.equals(this.f, credential.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 9, this.g, false);
        arxc.v(parcel, 10, this.h, false);
        arxc.c(parcel, a);
    }
}
