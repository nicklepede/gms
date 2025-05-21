package com.google.android.gms.smartdevice.d2d;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dcwe;
import defpackage.eigd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BootstrapAccount extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcwe();
    private static final HashMap j;
    public final Set a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    public String i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("name", new FastJsonResponse$Field(7, false, 7, false, "name", 2, null));
        hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 3, null));
        hashMap.put("isManaged", new FastJsonResponse$Field(6, false, 6, false, "isManaged", 4, null));
        hashMap.put("parentId", new FastJsonResponse$Field(7, false, 7, false, "parentId", 5, null));
        hashMap.put("isSupervised", new FastJsonResponse$Field(6, false, 6, false, "isSupervised", 6, null));
        hashMap.put("displayName", new FastJsonResponse$Field(7, false, 7, false, "displayName", 7, null));
        hashMap.put("givenName", new FastJsonResponse$Field(7, false, 7, false, "givenName", 8, null));
        hashMap.put("avatarString", new FastJsonResponse$Field(7, false, 7, false, "avatarString", 9, null));
    }

    public BootstrapAccount(Set set, String str, String str2, boolean z, String str3, boolean z2, String str4, String str5, String str6) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public static BootstrapAccount p(Account account) {
        return new BootstrapAccount(account.name, account.type);
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return Boolean.valueOf(this.d);
            case 5:
                return this.e;
            case 6:
                return Boolean.valueOf(this.f);
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

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return j;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof BootstrapAccount)) {
            return false;
        }
        String[] split = this.b.replace("@googlemail.com", "@gmail.com").split("\\.", -1);
        String[] split2 = ((BootstrapAccount) obj).b.replace("@googlemail.com", "@gmail.com").split("\\.", -1);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String str : split) {
            sb.append(str);
        }
        for (String str2 : split2) {
            sb2.append(str2);
        }
        return eigd.e(sb.toString(), sb2.toString());
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
        } else if (i == 5) {
            this.e = str2;
        } else if (i == 7) {
            this.g = str2;
        } else if (i == 8) {
            this.h = str2;
        } else {
            if (i != 9) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.i = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = z;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i)));
            }
            this.f = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    public final void q(String str) {
        this.a.add(7);
        this.g = str;
    }

    public final void r(String str) {
        this.a.add(8);
        this.h = str;
    }

    public final void s(boolean z) {
        this.a.add(4);
        this.d = z;
    }

    public final void t(boolean z) {
        this.a.add(6);
        this.f = z;
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
            arxc.e(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.e(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            arxc.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            arxc.v(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            arxc.v(parcel, 9, this.i, true);
        }
        arxc.c(parcel, a);
    }

    public BootstrapAccount() {
        this.a = new HashSet();
    }

    public BootstrapAccount(String str, String str2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        this.c = str2;
        hashSet.add(2);
        hashSet.add(3);
    }
}
