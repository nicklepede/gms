package com.google.android.gms.fonts.system;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bhbx;
import defpackage.bhcb;
import defpackage.bhcm;
import defpackage.bhdd;
import defpackage.bhdp;
import defpackage.bhdu;
import defpackage.bhdv;
import defpackage.byln;
import defpackage.eijj;
import defpackage.fofk;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class SystemFontsUpdateSchedulerBase extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    private final void e(int i) {
        bhdp.a.c(getApplicationContext()).d(9, i, "com.google.android.gms.fonts.system");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fofk.e()) {
            bhcm.f("SystemFontsUpdateScheduler", "SystemFontsUpdateScheduler fired but system installs are disabled", new Object[0]);
            return 2;
        }
        d();
        bhdp bhdpVar = bhdp.a;
        bhdd l = bhdpVar.l(getApplicationContext());
        bhdd k = bhdpVar.k();
        File file = new File(getApplicationContext().getFilesDir(), "systemfontupdatelog.txt");
        if (file.exists()) {
            bhdv bhdvVar = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine != null) {
                    List n = eijj.g(",").d().i().n(readLine);
                    if (n.size() == 3 || n.size() == 4) {
                        bhdv bhdvVar2 = new bhdv();
                        bhdvVar2.a = Integer.parseInt((String) n.get(0));
                        bhdvVar2.b = Integer.parseInt((String) n.get(1));
                        bhdvVar2.c = Long.parseLong((String) n.get(2));
                        if (n.size() == 4) {
                            bhdvVar2.d = Integer.parseInt((String) n.get(3));
                        }
                        bhdvVar = bhdvVar2;
                    }
                }
            } catch (IOException | NumberFormatException e) {
                bhcm.d("SystemFontsUpdateScheduler", e, "Reading from the systemFontUpdateLog file failed", new Object[0]);
            }
            if (bhdvVar != null) {
                if (bhdvVar.a >= l.b && ((!fofk.d() || bhdvVar.d >= k.b) && bhdvVar.b >= Build.VERSION.SDK_INT && bhdvVar.c >= Build.TIME)) {
                    return 0;
                }
            } else if (file.exists()) {
                file.delete();
            }
        }
        bhcm.c("SystemFontsUpdateScheduler", "Starting System Font Update process", new Object[0]);
        Context applicationContext = getApplicationContext();
        bhdp bhdpVar2 = bhdp.a;
        bhcb j = bhdpVar2.j();
        bhbx b = bhdpVar2.b(applicationContext);
        bhdd l2 = bhdpVar2.l(applicationContext);
        bhdd k2 = bhdpVar2.k();
        ExecutorService e2 = bhdpVar2.e();
        if (j == null) {
            bhcm.f("SystemFontsUpdateScheduler", "No downloader, SharedState not initialized. Bailing out.", new Object[0]);
            e(23502);
            return 2;
        }
        if (!b.j(50000L)) {
            bhcm.f("SystemFontsUpdateScheduler", "Not enough disk space to run update.", new Object[0]);
            e(23518);
            return 2;
        }
        boolean d = fofk.d();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(l2.b());
        if (d) {
            arrayList.addAll(k2.b());
        }
        e2.execute(new bhdu(arrayList, applicationContext, b, l2.b, d ? k2.b : 0, j, bhdpVar2.c(applicationContext), e2, file));
        return 0;
    }

    protected abstract void d();
}
