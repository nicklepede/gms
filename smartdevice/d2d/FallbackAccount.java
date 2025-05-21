package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dcxt;
import defpackage.eigd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FallbackAccount extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcxt();
    private static final HashMap e;
    final Set a;
    public String b;
    public String c;
    public String d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("name", new FastJsonResponse$Field(7, false, 7, false, "name", 2, null));
        hashMap.put("fallbackUrl", new FastJsonResponse$Field(7, false, 7, false, "fallbackUrl", 3, null));
        hashMap.put("targetSessionId", new FastJsonResponse$Field(7, false, 7, false, "targetSessionId", 4, null));
    }

    public FallbackAccount(Set set, String str, String str2, String str3) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return e;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof FallbackAccount)) {
            return false;
        }
        FallbackAccount fallbackAccount = (FallbackAccount) obj;
        return eigd.e(this.b, fallbackAccount.b) && eigd.e(this.c, fallbackAccount.c) && eigd.e(this.d, fallbackAccount.d);
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 3) {
            this.c = str2;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.d = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        arxc.c(parcel, a);
    }

    public FallbackAccount() {
        this.a = new HashSet();
    }

    public FallbackAccount(String str, String str2, String str3) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        this.c = str2;
        this.d = str3;
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
    }
}
