package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.voo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthenticatorAnnotatedData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new voo();
    private static final HashMap g;
    final Set a;
    final int b;
    public AuthenticatorTransferInfo c;
    public String d;
    public String e;
    public String f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse$Field(11, false, 11, false, "authenticatorInfo", 2, AuthenticatorTransferInfo.class));
        hashMap.put("signature", new FastJsonResponse$Field(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new FastJsonResponse$Field(7, false, 7, false, "package", 4, null));
    }

    public AuthenticatorAnnotatedData(Set set, int i, AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2, String str3) {
        this.a = set;
        this.b = i;
        this.c = authenticatorTransferInfo;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return g;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.d = str2;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), ashsVar.getClass().getCanonicalName()));
        }
        this.c = (AuthenticatorTransferInfo) ashsVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.o(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            arxc.t(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.f, true);
        }
        arxc.c(parcel, a);
    }

    public AuthenticatorAnnotatedData() {
        this.a = new HashSet(3);
        this.b = 1;
    }

    public AuthenticatorAnnotatedData(AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2, String str3) {
        this(new HashSet(), 1, authenticatorTransferInfo, str, str2, str3);
        this.a.add(2);
        this.a.add(3);
        this.a.add(4);
    }
}
