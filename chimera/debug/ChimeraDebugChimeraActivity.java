package com.google.android.gms.chimera.debug;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.chimera.debug.items.InfoItem;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aqjp;
import defpackage.aqkb;
import defpackage.aqke;
import defpackage.aqkl;
import defpackage.aqkm;
import defpackage.aqkv;
import defpackage.aqla;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bp;
import defpackage.dg;
import defpackage.eluo;
import defpackage.ew;
import defpackage.fowy;
import defpackage.fxsr;
import defpackage.fxxm;
import defpackage.fyao;
import defpackage.fybh;
import defpackage.ig;
import defpackage.ind;
import defpackage.rot;
import defpackage.rou;
import defpackage.rtg;
import defpackage.rxx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ChimeraDebugChimeraActivity extends rxx implements aqkv {
    private static final ausn j = ausn.b("ChimeraDebug", auid.CHIMERA_DEBUG);
    private ProgressDialog k;
    private UpdateModuleReceiver l;
    private ModuleManager.FeatureRequestListener m;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    final class UpdateModuleReceiver extends TracingBroadcastReceiver {
        public UpdateModuleReceiver() {
            super("chimera");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            fxxm.f(context, "context");
            fxxm.f(intent, "intent");
            if (fxxm.n("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED", intent.getAction())) {
                ChimeraDebugChimeraActivity.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(dg dgVar, Bundle bundle, String str, boolean z) {
        dgVar.setArguments(bundle);
        if (!z) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.fragment_container, dgVar, str);
            bpVar.d();
        } else {
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.z(R.id.fragment_container, dgVar, str);
            bpVar2.w(null);
            bpVar2.a();
        }
    }

    public final void a() {
        ProgressDialog progressDialog = this.k;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            fxxm.j("progressDialog");
            progressDialog = null;
        }
        if (!progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this.k;
            if (progressDialog3 == null) {
                fxxm.j("progressDialog");
            } else {
                progressDialog2 = progressDialog3;
            }
            progressDialog2.show();
        }
        this.m = new aqjp(this);
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.setUrgent(this.m);
        if (ModuleManager.get(this).requestFeatures(featureRequest)) {
            return;
        }
        ((eluo) j.i()).x("Feature request has failed");
        k();
    }

    public final void k() {
        ProgressDialog progressDialog = this.k;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            fxxm.j("progressDialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this.k;
            if (progressDialog3 == null) {
                fxxm.j("progressDialog");
            } else {
                progressDialog2 = progressDialog3;
            }
            progressDialog2.dismiss();
        }
    }

    @Override // defpackage.aqkv
    public final void l(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("chimera_message_key", str);
        s(new aqkb(), bundle, "tag_messageFragment", true);
    }

    @Override // defpackage.aqkv
    public final void m(ModuleItem moduleItem) {
        fxxm.f(moduleItem, "moduleItem");
        Bundle bundle = new Bundle();
        bundle.putParcelable("chimera_module_item_key", moduleItem);
        s(new aqke(), bundle, "tag_moduleDetailsFragment", true);
    }

    @Override // defpackage.aqkv
    public final void n(ModuleSetItem moduleSetItem) {
        fxxm.f(moduleSetItem, "moduleSetItem");
        Bundle bundle = new Bundle();
        bundle.putParcelable("chimera_module_set_item_key", moduleSetItem);
        s(new aqkm(), bundle, "tag_moduleSetDetailsFragment", true);
    }

    @Override // defpackage.aqkv
    public final void o() {
        q();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        String str;
        CharSequence charSequence;
        List list;
        super.onCreate(bundle);
        setContentView(R.layout.activity_chimera_debug);
        setTitle(getString(R.string.activity_title));
        ig hO = hO();
        if (hO != null) {
            hO.o(true);
        }
        if (!fowy.c()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("chimera_message_key", getString(R.string.disabled_err_msg));
            bundle2.putBoolean("chimera_enabled_flag_key", false);
            s(new aqkb(), bundle2, "tag_messageFragment", false);
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.updating_config_dialog_msg));
        this.k = progressDialog;
        this.l = new UpdateModuleReceiver();
        if (bundle == null) {
            try {
                ausn ausnVar = aqla.a;
                rot e = aqla.e(this);
                if (e == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                rtg d = aqla.d(this);
                rtg b = aqla.b(e, this);
                int c = e.c();
                ArrayList arrayList = new ArrayList();
                if (c == 0) {
                    arrayList.add(new InfoItem("default", ""));
                } else {
                    for (int i = 0; i < c; i++) {
                        String n = e.n(i);
                        fxxm.e(n, "configurationModes(...)");
                        arrayList.add(new InfoItem(n, ""));
                    }
                }
                int e2 = e.e();
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < e2; i2++) {
                    rou j2 = e.j(i2);
                    if (j2.g() != null && !hashMap.containsKey(j2.g())) {
                        hashMap.put(j2.g(), new ArrayList());
                    }
                    if (hashMap.get(j2.g()) != null && j2.e() != null && (list = (List) hashMap.get(j2.g())) != null) {
                        String e3 = j2.e();
                        fxxm.e(e3, "moduleId(...)");
                        list.add(e3);
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    Collection collection = (Collection) hashMap.get(str2);
                    if (collection == null || collection.isEmpty()) {
                        str = "";
                    } else {
                        Object obj = hashMap.get(str2);
                        fxxm.c(obj);
                        Iterator it = ((List) obj).iterator();
                        str = "";
                        while (it.hasNext()) {
                            str = str + ((String) fxsr.P(fybh.N((String) it.next(), new String[]{"."}, 0, 6))) + "\n";
                        }
                    }
                    String u = fybh.u(str2, "com.google.android.chimera.", str2);
                    int length = str.length() - 1;
                    if (length >= 0) {
                        while (true) {
                            int i3 = length - 1;
                            if (!fyao.a(str.charAt(length))) {
                                charSequence = str.subSequence(0, length + 1);
                                break;
                            } else if (i3 < 0) {
                                break;
                            } else {
                                length = i3;
                            }
                        }
                        arrayList2.add(new InfoItem(u, charSequence.toString()));
                    }
                    charSequence = "";
                    arrayList2.add(new InfoItem(u, charSequence.toString()));
                }
                dg h = getSupportFragmentManager().h("tag_moduleListFragment");
                if (h == null) {
                    h = new aqkl();
                }
                Bundle bundle3 = new Bundle();
                bundle3.putParcelableArrayList("chimera_module_set_list_key", new ArrayList<>(d));
                bundle3.putParcelableArrayList("chimera_module_list_key", new ArrayList<>(b));
                bundle3.putParcelableArrayList("chimera_info_list_key", new ArrayList<>(arrayList));
                if (!arrayList2.isEmpty()) {
                    bundle3.putParcelableArrayList("chimera_router_mapping_key", new ArrayList<>(arrayList2));
                }
                h.setArguments(bundle3);
                ew supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.T(null, 1);
                bp bpVar = new bp(supportFragmentManager);
                bpVar.z(R.id.fragment_container, h, "tag_moduleListFragment");
                bpVar.d();
            } catch (InvalidConfigException unused) {
                l(getString(R.string.config_err_msg));
            } catch (IllegalArgumentException unused2) {
                l(getString(R.string.config_err_msg));
            }
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        fxxm.f(menu, "menu");
        if (fowy.c()) {
            getMenuInflater().inflate(R.menu.menu_chimera_debug, menu);
            return true;
        }
        ig hO = hO();
        if (hO == null) {
            return false;
        }
        hO.h();
        return false;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fxxm.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId != R.id.check_updates) {
            return false;
        }
        a();
        return true;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        UpdateModuleReceiver updateModuleReceiver = this.l;
        if (updateModuleReceiver != null) {
            ind.b(this, updateModuleReceiver, new IntentFilter("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED"), 2);
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        ModuleManager.FeatureRequestListener featureRequestListener = this.m;
        if (featureRequestListener != null) {
            featureRequestListener.detach();
            this.m = null;
        }
        super.onStop();
        UpdateModuleReceiver updateModuleReceiver = this.l;
        if (updateModuleReceiver != null) {
            unregisterReceiver(updateModuleReceiver);
        }
    }

    @Override // defpackage.aqkv
    public final void p() {
        a();
    }

    public final void q() {
        int b;
        int b2;
        dg h = getSupportFragmentManager().h("tag_moduleListFragment");
        dg h2 = getSupportFragmentManager().h("tag_moduleDetailsFragment");
        dg h3 = getSupportFragmentManager().h("tag_moduleSetDetailsFragment");
        try {
            ausn ausnVar = aqla.a;
            rot e = aqla.e(this);
            if (e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            rtg d = aqla.d(this);
            rtg b3 = aqla.b(e, this);
            if (h != null) {
                Bundle a = aqla.a(h);
                a.putParcelableArrayList("chimera_module_set_list_key", new ArrayList<>(d));
                a.putParcelableArrayList("chimera_module_list_key", new ArrayList<>(b3));
                h.setArguments(a);
            }
            if (h3 != null) {
                Bundle a2 = aqla.a(h3);
                ModuleSetItem moduleSetItem = (ModuleSetItem) a2.getParcelable("chimera_module_set_item_key");
                if (moduleSetItem != null && (b2 = d.b(moduleSetItem)) >= 0) {
                    a2.putParcelable("chimera_module_set_item_key", (Parcelable) d.get(b2));
                }
                h3.setArguments(a2);
            }
            if (h2 != null) {
                Bundle a3 = aqla.a(h2);
                ModuleItem moduleItem = (ModuleItem) a3.getParcelable("chimera_module_item_key");
                if (moduleItem != null && (b = b3.b(moduleItem)) >= 0) {
                    a3.putParcelable("chimera_module_item_key", (Parcelable) b3.get(b));
                }
                h2.setArguments(a3);
            }
            dg g = getSupportFragmentManager().g(R.id.fragment_container);
            if (g != null) {
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.l(g);
                bpVar.x(g);
                bpVar.a();
            }
        } catch (InvalidConfigException unused) {
            l(getString(R.string.config_err_msg));
        } catch (IllegalArgumentException unused2) {
            l(getString(R.string.config_err_msg));
        }
    }
}
