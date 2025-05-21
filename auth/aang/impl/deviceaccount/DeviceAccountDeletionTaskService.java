package com.google.android.gms.auth.aang.impl.deviceaccount;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acbj;
import defpackage.arwm;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkey;
import defpackage.ftye;
import defpackage.unx;
import defpackage.uxq;
import defpackage.vba;
import defpackage.vlw;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceAccountDeletionTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = vba.a("DeviceAccountDeletionTaskService");

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
            ((ejhf) b.j()).z("Trying to schedule DeleteDeviceAccount task with invalid user ID %d", -1);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("android.intent.extra.user_handle", i);
        if (fkey.e()) {
            try {
                vlw a2 = ((uxq) uxq.a.b()).a(Integer.valueOf(i));
                if (a2 == null) {
                    ((ejhf) b.j()).z("No deletion data found for user %d", i);
                    return;
                } else {
                    bundle.putString("EXTRA_IDDID", a2.b);
                    bundle.putString("EXTRA_DELETION_BEARER_TOKEN", a2.c);
                }
            } catch (IOException e) {
                ((ejhf) ((ejhf) b.j()).s(e)).x("Error getting deletion data");
                return;
            }
        }
        bykj bykjVar = new bykj();
        bykjVar.t(e("TASK_DELETE_DEVICE_ACCOUNT", i));
        bykjVar.e(fkey.c(), fkey.b());
        bykjVar.p = true;
        bykjVar.u = bundle;
        bykjVar.v(2);
        bykjVar.w(DeviceAccountDeletionTaskService.class.getName());
        bykjVar.g(0);
        byjl.a(context).f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        vlw vlwVar;
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            ((ejhf) b.j()).x("Failing task because there are no extras.");
            return 2;
        }
        int d = d(bundle);
        char c = 65535;
        if (d == -1) {
            ((ejhf) b.j()).x("Failing task because there is no UserHandle ID included in the extras Bundle.");
            return 2;
        }
        String str = bylnVar.a;
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
                ((ejhf) b.j()).B("Unknown tag=%s", f(str));
                return 2;
            }
            if (fkey.e()) {
                String string = bundle.getString("EXTRA_IDDID");
                String string2 = bundle.getString("EXTRA_DELETION_BEARER_TOKEN");
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    ((ejhf) b.j()).x("Empty iddid or deletion bearer token. Failing task.");
                    return 2;
                }
                fecj v = vlw.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                string.getClass();
                ((vlw) fecpVar).b = string;
                if (!fecpVar.L()) {
                    v.U();
                }
                vlw vlwVar2 = (vlw) v.b;
                string2.getClass();
                vlwVar2.c = string2;
                vlwVar = (vlw) v.Q();
            } else {
                vlwVar = null;
            }
            acbj acbjVar = new acbj(AppContextProvider.a());
            try {
                try {
                    uxq uxqVar = (uxq) uxq.a.b();
                    Integer valueOf = Integer.valueOf(d);
                    if (vlwVar == null) {
                        vlwVar = uxqVar.a(valueOf);
                    }
                    if (uxq.g(acbjVar, vlwVar) != null) {
                        valueOf.getClass();
                        arwm.s(vlwVar);
                        uxqVar.d(d, vlwVar);
                        ((ejhf) uxq.b.h()).B("Deleted device account for user %d", valueOf);
                    }
                    return 0;
                } catch (ftye e) {
                    e = e;
                    ((ejhf) ((ejhf) b.j()).s(e)).z("Failed to delete device account for user %d.", d);
                    return 1;
                } catch (IOException e2) {
                    ((ejhf) ((ejhf) b.j()).s(e2)).z("Error retrieving device account deletion data for user %d.", d);
                    return 1;
                } catch (unx e3) {
                    e = e3;
                    ((ejhf) ((ejhf) b.j()).s(e)).z("Failed to delete device account for user %d.", d);
                    return 1;
                }
            } finally {
                acbjVar.b();
            }
        }
        String string3 = bundle.getString("EXTRA_IDDID");
        String string4 = bundle.getString("EXTRA_DELETION_BEARER_TOKEN");
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4)) {
            ((ejhf) b.j()).x("Cannot store device deletion data. IdDID and/or token is empty.");
            return 2;
        }
        try {
            ((uxq) uxq.a.b()).e(d, string3, string4);
            return 0;
        } catch (IOException e4) {
            ((ejhf) ((ejhf) b.j()).s(e4)).z("Error storing device account deletion data for user %d.", d);
        }
        return 1;
    }
}
