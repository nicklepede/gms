package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dgom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UserCredential extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dgom();
    private static final HashMap j;
    final Set a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("accountIdentifier", new FastJsonResponse$Field(7, false, 7, false, "accountIdentifier", 2, null));
        hashMap.put("status", new FastJsonResponse$Field(0, false, 0, false, "status", 3, null));
        hashMap.put("reason", new FastJsonResponse$Field(7, false, 7, false, "reason", 4, null));
        hashMap.put("fallbackUrl", new FastJsonResponse$Field(7, false, 7, false, "fallbackUrl", 5, null));
        hashMap.put("credential", new FastJsonResponse$Field(7, false, 7, false, "credential", 6, null));
        hashMap.put("firstName", new FastJsonResponse$Field(7, false, 7, false, "firstName", 7, null));
        hashMap.put("lastName", new FastJsonResponse$Field(7, false, 7, false, "lastName", 8, null));
        hashMap.put("obfuscatedGaiaId", new FastJsonResponse$Field(7, false, 7, false, "obfuscatedGaiaId", 9, null));
    }

    public UserCredential(Set set, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = set;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return this.b;
            case 3:
                return Integer.valueOf(this.c);
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            case 7:
                return this.g;
            case 8:
                return this.h;
            case 9:
                return this.i;
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return j;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                this.b = str2;
                break;
            case 3:
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            case 4:
                this.d = str2;
                break;
            case 5:
                this.e = str2;
                break;
            case 6:
                this.f = str2;
                break;
            case 7:
                this.g = str2;
                break;
            case 8:
                this.h = str2;
                break;
            case 9:
                this.i = str2;
                break;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 3) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.c = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            atzr.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.v(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            atzr.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            atzr.v(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            atzr.v(parcel, 9, this.i, true);
        }
        atzr.c(parcel, a);
    }

    public UserCredential() {
        this.a = new HashSet();
    }

    public UserCredential(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
    }
}
