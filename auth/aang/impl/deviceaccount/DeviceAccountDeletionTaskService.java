package com.google.android.gms.auth.aang.impl.deviceaccount;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aebj;
import defpackage.atzb;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmvk;
import defpackage.fwuc;
import defpackage.wjw;
import defpackage.wtq;
import defpackage.wxa;
import defpackage.xhx;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceAccountDeletionTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = wxa.a("DeviceAccountDeletionTaskService");

    public static int d(Bundle bundle) {
        if (bundle == null) {
            return -1;
        }
        return bundle.getInt("android.intent.extra.user_handle", -1);
    }

    public static String e(String str, int i) {
        return TextUtils.concat(str, "#USER", String.valueOf(i)).toString();
    }

    public static String f(String str) {
        int lastIndexOf = str.lastIndexOf("#USER");
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public static void g(Context context, int i) {
        if (i == -1) {
            ((eluo) b.j()).z("Trying to schedule DeleteDeviceAccount task with invalid user ID %d", -1);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("android.intent.extra.user_handle", i);
        if (fmvk.e()) {
            try {
                xhx a2 = ((wtq) wtq.a.b()).a(Integer.valueOf(i));
                if (a2 == null) {
                    ((eluo) b.j()).z("No deletion data found for user %d", i);
                    return;
                } else {
                    bundle.putString("EXTRA_IDDID", a2.b);
                    bundle.putString("EXTRA_DELETION_BEARER_TOKEN", a2.c);
                }
            } catch (IOException e) {
                ((eluo) ((eluo) b.j()).s(e)).x("Error getting deletion data");
                return;
            }
        }
        catb catbVar = new catb();
        catbVar.t(e("TASK_DELETE_DEVICE_ACCOUNT", i));
        catbVar.e(fmvk.c(), fmvk.b());
        catbVar.p = true;
        catbVar.u = bundle;
        catbVar.v(2);
        catbVar.w(DeviceAccountDeletionTaskService.class.getName());
        catbVar.g(0);
        casd.a(context).f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        xhx xhxVar;
        Bundle bundle = caufVar.b;
        if (bundle == null) {
            ((eluo) b.j()).x("Failing task because there are no extras.");
            return 2;
        }
        int d = d(bundle);
        char c = 65535;
        if (d == -1) {
            ((eluo) b.j()).x("Failing task because there is no UserHandle ID included in the extras Bundle.");
            return 2;
        }
        String str = caufVar.a;
        String f = f(str);
        int hashCode = f.hashCode();
        if (hashCode != -1613402370) {
            if (hashCode == -244355752 && f.equals("TASK_STORE_DEVICE_ACCOUNT_DELETION_DATA")) {
                c = 0;
            }
        } else if (f.equals("TASK_DELETE_DEVICE_ACCOUNT")) {
            c = 1;
        }
        if (c != 0) {
            if (c != 1) {
                ((eluo) b.j()).B("Unknown tag=%s", f(str));
                return 2;
            }
            if (fmvk.e()) {
                String string = bundle.getString("EXTRA_IDDID");
                String string2 = bundle.getString("EXTRA_DELETION_BEARER_TOKEN");
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    ((eluo) b.j()).x("Empty iddid or deletion bearer token. Failing task.");
                    return 2;
                }
                fgrc v = xhx.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                string.getClass();
                ((xhx) fgriVar).b = string;
                if (!fgriVar.L()) {
                    v.U();
                }
                xhx xhxVar2 = (xhx) v.b;
                string2.getClass();
                xhxVar2.c = string2;
                xhxVar = (xhx) v.Q();
            } else {
                xhxVar = null;
            }
            aebj aebjVar = new aebj(AppContextProvider.a());
            try {
                try {
                    wtq wtqVar = (wtq) wtq.a.b();
                    Integer valueOf = Integer.valueOf(d);
                    if (xhxVar == null) {
                        xhxVar = wtqVar.a(valueOf);
                    }
                    if (wtq.g(aebjVar, xhxVar) != null) {
                        valueOf.getClass();
                        atzb.s(xhxVar);
                        wtqVar.d(d, xhxVar);
                        ((eluo) wtq.b.h()).B("Deleted device account for user %d", valueOf);
                    }
                    return 0;
                } catch (fwuc e) {
                    e = e;
                    ((eluo) ((eluo) b.j()).s(e)).z("Failed to delete device account for user %d.", d);
                    return 1;
                } catch (IOException e2) {
                    ((eluo) ((eluo) b.j()).s(e2)).z("Error retrieving device account deletion data for user %d.", d);
                    return 1;
                } catch (wjw e3) {
                    e = e3;
                    ((eluo) ((eluo) b.j()).s(e)).z("Failed to delete device account for user %d.", d);
                    return 1;
                }
            } finally {
                aebjVar.b();
            }
        }
        String string3 = bundle.getString("EXTRA_IDDID");
        String string4 = bundle.getString("EXTRA_DELETION_BEARER_TOKEN");
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4)) {
            ((eluo) b.j()).x("Cannot store device deletion data. IdDID and/or token is empty.");
            return 2;
        }
        try {
            ((wtq) wtq.a.b()).e(d, string3, string4);
            return 0;
        } catch (IOException e4) {
            ((eluo) ((eluo) b.j()).s(e4)).z("Error storing device account deletion data for user %d.", d);
        }
        return 1;
    }
}
