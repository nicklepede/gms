package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import defpackage.a;
import defpackage.atzr;
import defpackage.bsj;
import defpackage.xkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountTransferProgress extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new xkn();
    private static final bsj g;
    final int a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;

    static {
        bsj bsjVar = new bsj();
        g = bsjVar;
        bsjVar.put("registered", new FastJsonResponse$Field(7, true, 7, true, "registered", 2, null));
        bsjVar.put("in_progress", new FastJsonResponse$Field(7, true, 7, true, "in_progress", 3, null));
        bsjVar.put("success", new FastJsonResponse$Field(7, true, 7, true, "success", 4, null));
        bsjVar.put("failed", new FastJsonResponse$Field(7, true, 7, true, "failed", 5, null));
        bsjVar.put("escrowed", new FastJsonResponse$Field(7, true, 7, true, "escrowed", 6, null));
    }

    public AccountTransferProgress() {
        this.a = 1;
    }

    private static final void p(Map map, List list, String str) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), str);
        }
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.a);
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
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final Map b() {
        return g;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    public final Map g() {
        bsj bsjVar = new bsj();
        p(bsjVar, this.b, "registered");
        p(bsjVar, this.c, "in_progress");
        p(bsjVar, this.d, "success");
        p(bsjVar, this.e, "failed");
        p(bsjVar, this.f, "escrowed");
        return bsjVar;
    }

    @Override // defpackage.aulm
    protected final void gN(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
            return;
        }
        if (i == 3) {
            this.c = arrayList;
            return;
        }
        if (i == 4) {
            this.d = arrayList;
        } else if (i == 5) {
            this.e = arrayList;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
            }
            this.f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.x(parcel, 2, this.b, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.x(parcel, 4, this.d, false);
        atzr.x(parcel, 5, this.e, false);
        atzr.x(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }

    public AccountTransferProgress(int i, List list, List list2, List list3, List list4, List list5) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public AccountTransferProgress(Map map) {
        char c;
        this.a = 1;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getValue();
            switch (str.hashCode()) {
                case -1869930878:
                    if (str.equals("registered")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1867169789:
                    if (str.equals("success")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1281977283:
                    if (str.equals("failed")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -753541113:
                    if (str.equals("in_progress")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1856884644:
                    if (str.equals("escrowed")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                this.b.add((String) entry.getKey());
            } else if (c == 1) {
                if (this.c == null) {
                    this.c = new ArrayList();
                }
                this.c.add((String) entry.getKey());
            } else if (c == 2) {
                if (this.d == null) {
                    this.d = new ArrayList();
                }
                this.d.add((String) entry.getKey());
            } else if (c == 3) {
                if (this.e == null) {
                    this.e = new ArrayList();
                }
                this.e.add((String) entry.getKey());
            } else if (c == 4) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                this.f.add((String) entry.getKey());
            } else {
                throw new IllegalArgumentException("Invalid ProgressStatus:".concat(String.valueOf((String) entry.getValue())));
            }
        }
    }
}
