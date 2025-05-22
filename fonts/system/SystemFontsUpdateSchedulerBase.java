package com.google.android.gms.fonts.system;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bjgn;
import defpackage.bjgr;
import defpackage.bjhc;
import defpackage.bjht;
import defpackage.bjif;
import defpackage.bjik;
import defpackage.bjil;
import defpackage.cauf;
import defpackage.ekwo;
import defpackage.fqxu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class SystemFontsUpdateSchedulerBase extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    private final void e(int i) {
        bjif.a.c(getApplicationContext()).d(9, i, "com.google.android.gms.fonts.system");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fqxu.e()) {
            bjhc.f("SystemFontsUpdateScheduler", "SystemFontsUpdateScheduler fired but system installs are disabled", new Object[0]);
            return 2;
        }
        d();
        bjif bjifVar = bjif.a;
        bjht l = bjifVar.l(getApplicationContext());
        bjht k = bjifVar.k();
        File file = new File(getApplicationContext().getFilesDir(), "systemfontupdatelog.txt");
        if (file.exists()) {
            bjil bjilVar = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine != null) {
                    List n = ekwo.g(",").d().i().n(readLine);
                    if (n.size() == 3 || n.size() == 4) {
                        bjil bjilVar2 = new bjil();
                        bjilVar2.a = Integer.parseInt((String) n.get(0));
                        bjilVar2.b = Integer.parseInt((String) n.get(1));
                        bjilVar2.c = Long.parseLong((String) n.get(2));
                        if (n.size() == 4) {
                            bjilVar2.d = Integer.parseInt((String) n.get(3));
                        }
                        bjilVar = bjilVar2;
                    }
                }
            } catch (IOException | NumberFormatException e) {
                bjhc.d("SystemFontsUpdateScheduler", e, "Reading from the systemFontUpdateLog file failed", new Object[0]);
            }
            if (bjilVar != null) {
                if (bjilVar.a >= l.b && ((!fqxu.d() || bjilVar.d >= k.b) && bjilVar.b >= Build.VERSION.SDK_INT && bjilVar.c >= Build.TIME)) {
                    return 0;
                }
            } else if (file.exists()) {
                file.delete();
            }
        }
        bjhc.c("SystemFontsUpdateScheduler", "Starting System Font Update process", new Object[0]);
        Context applicationContext = getApplicationContext();
        bjif bjifVar2 = bjif.a;
        bjgr j = bjifVar2.j();
        bjgn b = bjifVar2.b(applicationContext);
        bjht l2 = bjifVar2.l(applicationContext);
        bjht k2 = bjifVar2.k();
        ExecutorService e2 = bjifVar2.e();
        if (j == null) {
            bjhc.f("SystemFontsUpdateScheduler", "No downloader, SharedState not initialized. Bailing out.", new Object[0]);
            e(23502);
            return 2;
        }
        if (!b.j(50000L)) {
            bjhc.f("SystemFontsUpdateScheduler", "Not enough disk space to run update.", new Object[0]);
            e(23518);
            return 2;
        }
        boolean d = fqxu.d();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(l2.b());
        if (d) {
            arrayList.addAll(k2.b());
        }
        e2.execute(new bjik(arrayList, applicationContext, b, l2.b, d ? k2.b : 0, j, bjifVar2.c(applicationContext), e2, file));
        return 0;
    }

    protected abstract void d();
}
