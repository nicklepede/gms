package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dgnu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class Assertion extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dgnu();
    private static final HashMap h;
    final Set a;
    public String b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("accountIdentifier", new FastJsonResponse$Field(7, false, 7, false, "accountIdentifier", 2, null));
        hashMap.put("clientData", new FastJsonResponse$Field(8, false, 8, false, "clientData", 3, null));
        hashMap.put("encryptedUserAssertion", new FastJsonResponse$Field(8, false, 8, false, "encryptedUserAssertion", 4, null));
        hashMap.put("challengeSessionState", new FastJsonResponse$Field(8, false, 8, false, "challengeSessionState", 5, null));
        hashMap.put("challenge", new FastJsonResponse$Field(8, false, 8, false, "challenge", 6, null));
        hashMap.put("assertionType", new FastJsonResponse$Field(0, false, 0, false, "assertionType", 7, null));
    }

    public Assertion(Set set, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        this.a = set;
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = i;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            case 7:
                return Integer.valueOf(this.g);
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return h;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        if (str2 != null) {
            this.b = str2;
            this.a.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 7) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.g = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = bArr;
        } else if (i == 4) {
            this.d = bArr;
        } else if (i == 5) {
            this.e = bArr;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
            }
            this.f = bArr;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.i(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            atzr.i(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            atzr.i(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.i(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            atzr.o(parcel, 7, this.g);
        }
        atzr.c(parcel, a);
    }

    public Assertion() {
        this.a = new HashSet();
    }

    public Assertion(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = 1;
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
    }
}
