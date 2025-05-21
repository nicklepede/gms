package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.decs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class Challenge extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new decs();
    private static final HashMap g;
    final Set a;
    public int b;
    public String c;
    public String d;
    public byte[] e;
    public byte[] f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("status", new FastJsonResponse$Field(0, false, 0, false, "status", 2, null));
        hashMap.put("accountIdentifier", new FastJsonResponse$Field(7, false, 7, false, "accountIdentifier", 3, null));
        hashMap.put("reason", new FastJsonResponse$Field(7, false, 7, false, "reason", 4, null));
        hashMap.put("challenge", new FastJsonResponse$Field(8, false, 8, false, "challenge", 5, null));
        hashMap.put("challengeSessionState", new FastJsonResponse$Field(8, false, 8, false, "challengeSessionState", 6, null));
    }

    public Challenge(Set set, int i, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = bArr2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Integer.valueOf(this.b);
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        if (i == 6) {
            return this.f;
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
        if (i != 3) {
            if (i != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.d = str2;
        } else if (str2 == null) {
            return;
        } else {
            this.c = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gf(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.e = bArr;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
            }
            this.f = bArr;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 2) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.b = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            arxc.i(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.i(parcel, 6, this.f, true);
        }
        arxc.c(parcel, a);
    }

    public Challenge() {
        this.a = new HashSet();
    }

    public Challenge(int i, String str, String str2, byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = bArr2;
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
    }
}
