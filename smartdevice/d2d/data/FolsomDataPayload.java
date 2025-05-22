package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dfrc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FolsomDataPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfrc();
    private static final HashMap d;
    final Set a;
    public String b;
    public ArrayList c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("accountName", new FastJsonResponse$Field(7, false, 7, false, "accountName", 2, null));
        hashMap.put("securityDomainAndKeys", new FastJsonResponse$Field(11, true, 11, true, "securityDomainAndKeys", 3, FolsomSecurityDomainAndKeys.class));
    }

    public FolsomDataPayload(Set set, String str, ArrayList arrayList) {
        this.a = set;
        this.b = str;
        this.c = arrayList;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final Map b() {
        return d;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            if (str2 != null) {
                this.b = str2;
                this.a.add(2);
                return;
            }
            i = 2;
        }
        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a valid string."));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    boolean z = arrayList.get(i2) instanceof FolsomSecurityDomainAndKeys;
                    i2++;
                    if (z) {
                    }
                }
                this.c = arrayList;
                this.a.add(3);
                return;
            }
            i = 3;
        }
        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not a known array type."));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.y(parcel, 3, this.c, true);
        }
        atzr.c(parcel, a);
    }

    public FolsomDataPayload() {
        this.a = new HashSet();
        this.b = "UNINITIALIZED";
        this.c = new ArrayList(0);
    }

    public FolsomDataPayload(String str, ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = "UNINITIALIZED";
        new ArrayList(0);
        this.b = str;
        this.c = arrayList;
        hashSet.add(2);
        hashSet.add(3);
    }
}
