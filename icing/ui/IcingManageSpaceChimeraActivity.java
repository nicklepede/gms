package com.google.android.gms.icing.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.bntc;
import defpackage.bobp;
import defpackage.bobs;
import defpackage.frtk;
import defpackage.ill;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IcingManageSpaceChimeraActivity extends rxx implements AdapterView.OnItemClickListener {
    public View j;
    public View k;
    public TextView l;
    public ListView m;
    public TextView n;
    private bobp o;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.icing_manage_space_activity);
        this.j = findViewById(R.id.main_view);
        this.k = findViewById(R.id.icing_progress_bar);
        this.l = (TextView) findViewById(R.id.total_size_text);
        ListView listView = (ListView) findViewById(R.id.apps_list);
        this.m = listView;
        listView.setOnItemClickListener(this);
        TextView textView = (TextView) findViewById(R.id.empty_list_view);
        this.n = textView;
        this.m.setEmptyView(textView);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.icing_manage_settings_menu, menu);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bobs bobsVar = (bobs) this.m.getAdapter();
        if (bobsVar == null || i < 0 || i >= bobsVar.getCount()) {
            return;
        }
        String str = bobsVar.getItem(i).a;
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", str, null));
        startActivity(intent);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.icing_settings_help) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(frtk.a.lK().B())));
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ill.e(getContainerActivity());
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        bobp bobpVar = this.o;
        if (bobpVar != null) {
            bobpVar.cancel(true);
            this.o = null;
        }
        super.onPause();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        bobp bobpVar = new bobp(this);
        this.o = bobpVar;
        bobpVar.execute(new Void[0]);
        new bntc(getApplicationContext()).p(8004);
    }
}
